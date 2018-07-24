package com.framgia.httpurlconnectionexample.entity;

import java.util.HashMap;
import java.util.Map;

public class License {

    private String mKey;
    private String mName;
    private String mSpdxId;
    private String mUrl;
    private String mNodeId;
    private Map<String, Object> mAdditionalProperties = new HashMap<String, Object>();

    public License() {
    }

    public License(String key, String name, String spdxId, String url, String nodeId) {
        super();
        this.mKey = key;
        this.mName = name;
        this.mSpdxId = spdxId;
        this.mUrl = url;
        this.mNodeId = nodeId;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        this.mKey = key;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getSpdxId() {
        return mSpdxId;
    }

    public void setSpdxId(String spdxId) {
        this.mSpdxId = spdxId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public String getNodeId() {
        return mNodeId;
    }

    public void setNodeId(String nodeId) {
        this.mNodeId = nodeId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.mAdditionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.mAdditionalProperties.put(name, value);
    }
}
