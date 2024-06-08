package src.java.adapter;

public class GitHubRunner implements IRunner {
    private String credential;

    public GitHubRunner(String credential) {
        this.credential = credential;
    }

    public String buildImageAndPushImage(String tagVersion, String imageName, String repoName) {
        return "building, pushing and return image ID";
    }

    @Override
    public String buildAndPush(String tagVersion, String imageName, String repoName) {
        return buildImageAndPushImage(tagVersion, imageName, repoName);
    }
}
