package com.kodilla.testing.forum;

public class ForumComment {

    ForumPost fourmPost;
    String commentBody;
    String author;

    public ForumComment(ForumPost fourmPost, String commentBody,  String author) {
        this.fourmPost = fourmPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getFourmPost() {
        return fourmPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (!fourmPost.equals(that.fourmPost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return author.equals(that.author);

    }

    @Override
    public int hashCode() {
        int result = fourmPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
