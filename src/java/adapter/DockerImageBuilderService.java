package src.java.adapter;

public class DockerImageBuilderService {
    public void main(String[] args) {
        IRunner runner = new GitlabRunnerAdapter("1234");
//        IRunner runner = new GitHubRunner("1234");
        System.out.println(runner.buildAndPush("tag", "imgName", "repo"));
    }
}
