package com.framgia.httpurlconnectionexample.entity;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private int mId;
    private String mNodeId;
    private String mName;
    private String mFullName;
    private Owner mOwner;
    private boolean mPrivate;
    private String mHtmlUrl;
    private Object mDescription;
    private boolean mFork;
    private String mUrl;
    private String mForksUrl;
    private String mKeysUrl;
    private String mCollaboratorsUrl;
    private String mTeamsUrl;
    private String mHooksUrl;
    private String mIssueEventsUrl;
    private String mEventsUrl;
    private String mAssigneesUrl;
    private String mBranchesUrl;
    private String mTagsUrl;
    private String mBlobsUrl;
    private String mGitTagsUrl;
    private String mGitRefsUrl;
    private String mTreesUrl;
    private String mStatusesUrl;
    private String mLanguagesUrl;
    private String mStargazersUrl;
    private String mContributorsUrl;
    private String mSubscribersUrl;
    private String mSubscriptionUrl;
    private String mCommitsUrl;
    private String mGitCommitsUrl;
    private String mCommentsUrl;
    private String mIssueCommentUrl;
    private String mContentsUrl;
    private String mCompareUrl;
    private String mMergesUrl;
    private String mArchiveUrl;
    private String mDownloadsUrl;
    private String mIssuesUrl;
    private String mPullsUrl;
    private String mMilestonesUrl;
    private String mNotificationsUrl;
    private String mLabelsUrl;
    private String mReleasesUrl;
    private String mDeploymentsUrl;
    private String mCreatedAt;
    private String mUpdatedAt;
    private String mPushedAt;
    private String mGitUrl;
    private String mSshUrl;
    private String mCloneUrl;
    private String mSvnUrl;
    private Object mHomepage;
    private int mSize;
    private int mStargazersCount;
    private int mWatchersCount;
    private String mLanguage;
    private boolean mHasIssues;
    private boolean mHasProjects;
    private boolean mHasDownloads;
    private boolean mHasWiki;
    private boolean mHasPages;
    private int mForksCount;
    private Object mMirrorUrl;
    private boolean mArchived;
    private int mOpenIssuesCount;
    private License mLicense;
    private int mForks;
    private int mOpenIssues;
    private int mWatchers;
    private String mDefaultBranch;
    private Map<String, Object> mAdditionalProperties = new HashMap<String, Object>();


    public Data() {
    }

    public Data(int id, String nodeId, String name, String fullName, Owner owner) {
        this.mId = id;
        this.mNodeId = nodeId;
        this.mName = name;
        this.mFullName = fullName;
        this.mOwner = owner;
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

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        this.mFullName = fullName;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public void setOwner(Owner owner) {
        this.mOwner = owner;
    }

    public boolean isPrivate() {
        return mPrivate;
    }

    public void setPrivate(boolean _private) {
        this.mPrivate = _private;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.mHtmlUrl = htmlUrl;
    }

    public Object getDescription() {
        return mDescription;
    }

    public void setDescription(Object description) {
        this.mDescription = description;
    }

    public boolean isFork() {
        return mFork;
    }

    public void setFork(boolean fork) {
        this.mFork = fork;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public String getForksUrl() {
        return mForksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.mForksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return mKeysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.mKeysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return mCollaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.mCollaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return mTeamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.mTeamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return mHooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.mHooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return mIssueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.mIssueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.mEventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return mAssigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.mAssigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return mBranchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.mBranchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return mTagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.mTagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return mBlobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.mBlobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return mGitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.mGitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return mGitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.mGitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return mTreesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.mTreesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return mStatusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.mStatusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return mLanguagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.mLanguagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return mStargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.mStargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return mContributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.mContributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return mSubscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.mSubscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return mSubscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.mSubscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return mCommitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.mCommitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return mGitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.mGitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.mCommentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return mIssueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.mIssueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return mContentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.mContentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return mCompareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.mCompareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mMergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mMergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return mArchiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.mArchiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return mDownloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.mDownloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return mIssuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.mIssuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return mPullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.mPullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return mMilestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.mMilestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return mNotificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.mNotificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return mLabelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.mLabelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return mReleasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.mReleasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return mDeploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.mDeploymentsUrl = deploymentsUrl;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        this.mCreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.mUpdatedAt = updatedAt;
    }

    public String getPushedAt() {
        return mPushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.mPushedAt = pushedAt;
    }

    public String getGitUrl() {
        return mGitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.mGitUrl = gitUrl;
    }

    public String getSshUrl() {
        return mSshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.mSshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return mCloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.mCloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return mSvnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.mSvnUrl = svnUrl;
    }

    public Object getHomepage() {
        return mHomepage;
    }

    public void setHomepage(Object homepage) {
        this.mHomepage = homepage;
    }

    public int getSize() {
        return mSize;
    }

    public void setSize(int size) {
        this.mSize = size;
    }

    public int getStargazersCount() {
        return mStargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        this.mStargazersCount = stargazersCount;
    }

    public int getWatchersCount() {
        return mWatchersCount;
    }

    public void setWatchersCount(int watchersCount) {
        this.mWatchersCount = watchersCount;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        this.mLanguage = language;
    }

    public boolean isHasIssues() {
        return mHasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.mHasIssues = hasIssues;
    }

    public boolean isHasProjects() {
        return mHasProjects;
    }

    public void setHasProjects(boolean hasProjects) {
        this.mHasProjects = hasProjects;
    }

    public boolean isHasDownloads() {
        return mHasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        this.mHasDownloads = hasDownloads;
    }

    public boolean isHasWiki() {
        return mHasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.mHasWiki = hasWiki;
    }

    public boolean isHasPages() {
        return mHasPages;
    }

    public void setHasPages(boolean hasPages) {
        this.mHasPages = hasPages;
    }

    public int getForksCount() {
        return mForksCount;
    }

    public void setForksCount(int forksCount) {
        this.mForksCount = forksCount;
    }

    public Object getMirrorUrl() {
        return mMirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        this.mMirrorUrl = mirrorUrl;
    }

    public boolean isArchived() {
        return mArchived;
    }

    public void setArchived(boolean archived) {
        this.mArchived = archived;
    }

    public int getOpenIssuesCount() {
        return mOpenIssuesCount;
    }

    public void setOpenIssuesCount(int openIssuesCount) {
        this.mOpenIssuesCount = openIssuesCount;
    }

    public License getLicense() {
        return mLicense;
    }

    public void setLicense(License license) {
        this.mLicense = license;
    }

    public int getForks() {
        return mForks;
    }

    public void setForks(int forks) {
        this.mForks = forks;
    }

    public int getOpenIssues() {
        return mOpenIssues;
    }

    public void setOpenIssues(int openIssues) {
        this.mOpenIssues = openIssues;
    }

    public int getWatchers() {
        return mWatchers;
    }

    public void setWatchers(int watchers) {
        this.mWatchers = watchers;
    }

    public String getDefaultBranch() {
        return mDefaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.mDefaultBranch = defaultBranch;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.mAdditionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.mAdditionalProperties.put(name, value);
    }

}
