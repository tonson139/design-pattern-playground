package src.java.adapter;

public class GitlabRunnerAdapter implements IRunner {
    private GitlabRunner gitlabRunner;

    GitlabRunnerAdapter(String credential) {
        this.gitlabRunner = new GitlabRunner(credential);
    }


    public String buildAndPush(String tagVersion, String imageName, String repoName) {
        String imageId = this.gitlabRunner.buildImage(tagVersion, imageName, repoName);
        this.gitlabRunner.pushImage(imageId);
        return imageId;
    }
}
