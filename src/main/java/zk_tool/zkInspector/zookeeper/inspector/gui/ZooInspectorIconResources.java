/*
 * ZooInspector
 * 
 * Copyright 2010 Colin Goodheart-Smithe

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package zk_tool.zkInspector.zookeeper.inspector.gui;

import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author CGSmithe
 * 
 */
public class ZooInspectorIconResources
{
	
	public static ResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();

	/**
	 * @return file icon
	 *  
	 */
	public static ImageIcon getTreeLeafIcon()
	{
		Resource resource = resourceLoader.getResource("icons/file_obj.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return folder open icon
	 *  
	 */
	public static ImageIcon getTreeOpenIcon()
	{
		Resource resource = resourceLoader.getResource("icons/fldr_obj.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return folder closed icon
	 *  
	 */
	public static ImageIcon getTreeClosedIcon()
	{
		Resource resource = resourceLoader.getResource("icons/fldr_obj.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return connect icon
	 *  
	 */
	public static ImageIcon getConnectIcon()
	{
		
		Resource resource = resourceLoader.getResource("icons/launch_run.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url);
	}

	/**
	 * @return disconnect icon
	 *  
	 */
	public static ImageIcon getDisconnectIcon()
	{
		Resource resource = resourceLoader.getResource("icons/launch_stop.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return save icon
	 *  
	 */
	public static ImageIcon getSaveIcon()
	{
		Resource resource = resourceLoader.getResource("icons/save_edit.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return add icon
	 *  
	 */
	public static ImageIcon getAddNodeIcon()
	{
		Resource resource = resourceLoader.getResource("icons/new_con.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return delete icon
	 *  
	 */
	public static ImageIcon getDeleteNodeIcon()
	{
		Resource resource = resourceLoader.getResource("icons/trash.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return refresh icon
	 *  
	 */
	public static ImageIcon getRefreshIcon()
	{
		Resource resource = resourceLoader.getResource("icons/refresh.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return information icon
	 *  
	 */
	public static ImageIcon getInformationIcon()
	{
		Resource resource = resourceLoader.getResource("icons/info_obj.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return node viewers icon
	 *  
	 */
	public static ImageIcon getChangeNodeViewersIcon()
	{
		Resource resource = resourceLoader.getResource("icons/edtsrclkup_co.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return up icon
	 *  
	 */
	public static ImageIcon getUpIcon()
	{
		Resource resource = resourceLoader.getResource("icons/search_prev.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}

	/**
	 * @return down icon
	 *  
	 */
	public static ImageIcon getDownIcon()
	{
		Resource resource = resourceLoader.getResource("icons/search_next.gif");
		URL url = null;
		try {
			url = resource.getURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(url); //$NON-NLS-1$
	}
}
