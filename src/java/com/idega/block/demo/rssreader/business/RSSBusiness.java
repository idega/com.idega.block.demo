/*
 * $Id: RSSBusiness.java,v 1.1 2005/04/05 18:36:47 eiki Exp $
 * Created on Sep 9, 2004
 *
 * Copyright (C) 2004 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.block.demo.rssreader.business;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.List;
import javax.ejb.FinderException;
import com.idega.block.demo.rssreader.data.RSSSource;
import com.idega.business.IBOService;

/**
 * 
 *  Last modified: $Date: 2005/04/05 18:36:47 $ by $Author: eiki $
 * 
 * @author <a href="mailto:eiki@idega.com">eiki</a>
 * @version $Revision: 1.1 $
 */
public interface RSSBusiness extends IBOService{
/**
 * @see com.idega.block.rss.business.RSSBusinessBean#getRSSSourceBySourceId
 */
public RSSSource getRSSSourceBySourceId(int sourceId) throws java.rmi.RemoteException;
/**
 * @see com.idega.block.rss.business.RSSBusinessBean#getRSSHeadlinesByRSSSource
 */
public Collection getRSSHeadlinesByRSSSource(RSSSource rssSource) throws java.rmi.RemoteException;
/**
 * @see com.idega.block.rss.business.RSSBusinessBean#getAllRSSSources
 */
public List getAllRSSSources() throws java.rmi.RemoteException;
/**
 * @see com.idega.block.rss.business.RSSBusinessBean#createNewRSSSource
 */
public boolean createNewRSSSource(String name, String url) throws java.rmi.RemoteException;
/**
 * @see com.idega.block.rss.business.RSSBusinessBean#getHeadlinesByRSSSource
 */
public Collection getHeadlinesByRSSSource(RSSSource rssSource) throws RemoteException,FinderException;
/**
 * @see com.idega.block.rss.business.RSSBusinessBean#removeSourceById
 */
public boolean removeSourceById(int id) throws java.rmi.RemoteException;

}
