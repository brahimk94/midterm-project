package parser.json;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Articles {
    private MysqlxDatatypes.Scalar.String author;
    private MysqlxDatatypes.Scalar.String title;
    private MysqlxDatatypes.Scalar.String description;
    private MysqlxDatatypes.Scalar.String url;
    private MysqlxDatatypes.Scalar.String urlToImage;
    private MysqlxDatatypes.Scalar.String publishedAt;
    private MysqlxDatatypes.Scalar.String content;
    private Source source;

    public Articles(MysqlxDatatypes.Scalar.String author, MysqlxDatatypes.Scalar.String title, MysqlxDatatypes.Scalar.String description, MysqlxDatatypes.Scalar.String url, MysqlxDatatypes.Scalar.String urlToImage, MysqlxDatatypes.Scalar.String publishedAt, String content) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        // this.content = content;
        this.source = source;
    }

    public Articles() {
    }

    public MysqlxDatatypes.Scalar.String getAuthor() {
        return author;
    }

    public void setAuthor(MysqlxDatatypes.Scalar.String author) {
        this.author = author;
    }

    public MysqlxDatatypes.Scalar.String getTitle() {
        return title;
    }

    public void setTitle(MysqlxDatatypes.Scalar.String title) {
        this.title = title;
    }

    public MysqlxDatatypes.Scalar.String getDescription() {
        return description;
    }

    public void setDescription(MysqlxDatatypes.Scalar.String description) {
        this.description = description;
    }

    public MysqlxDatatypes.Scalar.String getUrl() {
        return url;
    }

    public void setUrl(MysqlxDatatypes.Scalar.String url) {
        this.url = url;
    }

    public MysqlxDatatypes.Scalar.String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(MysqlxDatatypes.Scalar.String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public MysqlxDatatypes.Scalar.String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(MysqlxDatatypes.Scalar.String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public MysqlxDatatypes.Scalar.String getContent() {
        return content;
    }

    public void setContent(MysqlxDatatypes.Scalar.String content) {
        this.content = content;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

}