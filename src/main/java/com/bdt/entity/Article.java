package com.bdt.entity;import io.swagger.annotations.ApiOperation;import springfox.documentation.swagger2.annotations.EnableSwagger2;import java.io.Serializable;import java.util.Date;public class Article implements Serializable{        /**     * serialVersionUID     */    private static final long serialVersionUID = 1L;        protected Long article_id;    protected Long type;    protected String article_title;    protected String article_content;    protected String viewpoint_img_audio;    protected Long upvote_num;    protected Long comment_num;    protected Date send_time;    protected Long author;    protected Long is_top;    protected Date update_time;    protected Long read_num;    protected Long share_num;        public Long getArticle_id() {        return article_id;    }        public void setArticle_id(Long article_id) {        this.article_id = article_id;    }        public Long getType() {        return type;    }        public void setType(Long type) {        this.type = type;    }        public String getArticle_title() {        return article_title;    }        public void setArticle_title(String article_title) {        this.article_title = article_title;    }        public String getArticle_content() {        return article_content;    }        public void setArticle_content(String article_content) {        this.article_content = article_content;    }        public String getViewpoint_img_audio() {        return viewpoint_img_audio;    }        public void setViewpoint_img_audio(String viewpoint_img_audio) {        this.viewpoint_img_audio = viewpoint_img_audio;    }        public Long getUpvote_num() {        return upvote_num;    }        public void setUpvote_num(Long upvote_num) {        this.upvote_num = upvote_num;    }        public Long getComment_num() {        return comment_num;    }        public void setComment_num(Long comment_num) {        this.comment_num = comment_num;    }        public Date getSend_time() {        return send_time;    }        public void setSend_time(Date send_time) {        this.send_time = send_time;    }        public Long getAuthor() {        return author;    }        public void setAuthor(Long author) {        this.author = author;    }        public Long getIs_top() {        return is_top;    }        public void setIs_top(Long is_top) {        this.is_top = is_top;    }        public Date getUpdate_time() {        return update_time;    }        public void setUpdate_time(Date update_time) {        this.update_time = update_time;    }        public Long getRead_num() {        return read_num;    }        public void setRead_num(Long read_num) {        this.read_num = read_num;    }        public Long getShare_num() {        return share_num;    }        public void setShare_num(Long share_num) {        this.share_num = share_num;    }            @Override    public String toString() {        StringBuilder builder = new StringBuilder();        builder.append("Article [article_id=").append(article_id)                .append(", type=").append(type)                .append(", article_title=").append(article_title)                .append(", article_content=").append(article_content)                .append(", viewpoint_img_audio=").append(viewpoint_img_audio)                .append(", upvote_num=").append(upvote_num)                .append(", comment_num=").append(comment_num)                .append(", send_time=").append(send_time)                .append(", author=").append(author)                .append(", is_top=").append(is_top)                .append(", update_time=").append(update_time)                .append(", read_num=").append(read_num)                .append(", share_num=").append(share_num)                .append("]");        return builder.toString();    }    }