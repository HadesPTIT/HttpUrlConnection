package com.framgia.httpurlconnectionexample.entity;

import java.util.HashMap;
import java.util.Map;

public class Owner {

    private String mLogin;
    private int mId;
    private String mNodeId;
    private String mAvatarUrl;
    private String mGravatarId;
    private String mUrl;
    private String mHtmlUrl;
    private String mFollowersUrl;
    private String mFollowingUrl;
    private String mGistsUrl;
    private String mStarredUrl;
    private String mSubscriptionsUrl;
    private String mOrganizationsUrl;
    private String mReposUrl;
    private String mEventsUrl;
    private String mReceivedEventsUrl;
    private String mType;
    private boolean mSiteAdmin;
    private Map<String, Object> mAdditionalProperties = new HashMap<String, Object>();

    public Owner() {
    }

    public Owner(int id, String avatarUrl) {
        this.mId = id;
        this.mAvatarUrl = avatarUrl;
    }

    public Owner(String login, int id, String nodeId, String avatarUrl, String gravatarId, String url, String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, boolean siteAdmin) {
        super();
        this.mLogin = login;
        this.mId = id;
        this.mNodeId = nodeId;
        this.mAvatarUrl = avatarUrl;
        this.mGravatarId = gravatarId;
        this.mUrl = url;
        this.mHtmlUrl = htmlUrl;
        this.mFollowersUrl = followersUrl;
        this.mFollowingUrl = followingUrl;
        this.mGistsUrl = gistsUrl;
        this.mStarredUrl = starredUrl;
        this.mSubscriptionsUrl = subscriptionsUrl;
        this.mOrganizationsUrl = organizationsUrl;
        this.mReposUrl = reposUrl;
        this.mEventsUrl = eventsUrl;
        this.mReceivedEventsUrl = receivedEventsUrl;
        this.mType = type;
        this.mSiteAdmin = siteAdmin;
    }

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        this.mLogin = login;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getNodeId() {
        return mNodeId;
    }

    public void setNodeId(String nodeId) {
        this.mNodeId = nodeId;
    }

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.mAvatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return mGravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.mGravatarId = gravatarId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.mHtmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return mFollowersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.mFollowersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return mFollowingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.mFollowingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return mGistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.mGistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return mStarredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.mStarredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return mSubscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.mSubscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return mOrganizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.mOrganizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return mReposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.mReposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.mEventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return mReceivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.mReceivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        this.mType = type;
    }

    public boolean isSiteAdmin() {
        return mSiteAdmin;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        this.mSiteAdmin = siteAdmin;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.mAdditionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.mAdditionalProperties.put(name, value);
    }

}
