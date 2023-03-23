package com.study.creational_pattern.prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("wonpyol");
        repository.setName("prototype");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("prototype 은 어떻게 만드나?");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

        //clone
        GithubIssue clone = githubIssue.clone();
        System.out.println("clone = " + clone.getUrl());
        System.out.println("clone.getTitle() = " + clone.getTitle());

        //clone method deep copy 구현해야함
        githubIssue.setTitle("prototype 은 어떻게 만드나? (변경");



    }

}
