package com.study.creational_patterns.prototype._01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("wonpyol");
        repository.setName("prototype");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("prototype 은 어떻게 만드나?");

        String url = githubIssue.getUrl();
        System.out.println(url);
    }

}
