/*
 * $Id: RSSBusinessHome.java,v 1.1 2005/04/05 18:36:47 eiki Exp $
 * Created on Sep 9, 2004
 *
 * Copyright (C) 2004 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.block.demo.rssreader.business;

import com.idega.business.IBOHome;


/**
 * 
 *  Last modified: $Date: 2005/04/05 18:36:47 $ by $Author: eiki $
 * 
 * @author <a href="mailto:eiki@idega.com">eiki</a>
 * @version $Revision: 1.1 $
 */
public interface RSSBusinessHome extends IBOHome {

	public RSSBusiness create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
