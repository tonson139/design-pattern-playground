package src.java.adapter;

public class GitlabRunner {
    private String credential;

    public GitlabRunner(String credential) {
        this.credential = credential;
    }

    public String buildImage(String tagVersion, String imageName, String repoName) {
        return "building... and return image ID";
    }

    public void pushImage(String imageId) {
        System.out.println(STR."pushing to repo \{imageId}");
    }
}
