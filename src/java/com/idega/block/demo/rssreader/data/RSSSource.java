package com.idega.block.demo.rssreader.data;


public interface RSSSource extends com.idega.data.IDOEntity
{
 public void addHeadline(RSSHeadline p0);
 public boolean equals(java.lang.Object p0);
 public java.util.Collection getHeadlines();
 public java.lang.String getName();
 public java.lang.String getSourceURL();
 public void initializeAttributes();
 public void removeHeadlines();
 public void setName(java.lang.String p0);
 public void setSourceURL(java.lang.String p0);
 public java.lang.String toString();
}
