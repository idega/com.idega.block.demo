package com.idega.block.demo.rssreader.data;


public interface RSSHeadlineHome extends com.idega.data.IDOHome
{
 public RSSHeadline create() throws javax.ejb.CreateException;
 public RSSHeadline findByPrimaryKey(Object pk) throws javax.ejb.FinderException;

}