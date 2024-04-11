package org.gabris.RestApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.gabris.RestApi.util.HttpVerb;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pages")
public class Page {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @JsonProperty
    Long id;
    private String pageName;
    private List<HttpVerb> verbs;
    private String contentType;
    private String path;

    public Page() {
    }

    public Page(String pageName, List<HttpVerb> verbs, String contentType, String path) {
        this.pageName = pageName;
        this.verbs = verbs;
        this.contentType = contentType;
        this.path = path;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public List<HttpVerb> getVerbs() {
        return verbs;
    }

    public void setVerbs(List<HttpVerb> verbs) {
        this.verbs = verbs;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return Objects.equals(id, page.id) && Objects.equals(pageName, page.pageName) && Objects.equals(verbs, page.verbs) && Objects.equals(contentType, page.contentType) && Objects.equals(path, page.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pageName, verbs, contentType, path);
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", pageName='" + pageName + '\'' +
                ", verbs=" + verbs +
                ", contentType='" + contentType + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}