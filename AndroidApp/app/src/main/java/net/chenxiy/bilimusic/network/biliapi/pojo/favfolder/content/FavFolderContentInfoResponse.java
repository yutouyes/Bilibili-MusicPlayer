
package net.chenxiy.bilimusic.network.biliapi.pojo.favfolder.content;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FavFolderContentInfoResponse {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("ttl")
    @Expose
    private Integer ttl;
    @SerializedName("data")
    @Expose
    private FavFolderContentData favFolderContentData;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public FavFolderContentData getFavFolderContentData() {
        return favFolderContentData;
    }

    public void setFavFolderContentData(FavFolderContentData favFolderContentData) {
        this.favFolderContentData = favFolderContentData;
    }

}
