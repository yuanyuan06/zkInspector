/**
 * 
 */
package zk_tool.zkInspector.zookeeper.inspector.gui;

import java.util.List;

import zk_tool.zkInspector.zookeeper.inspector.gui.nodeviewer.ZooInspectorNodeViewer;


/**
 * @author CGSmithe
 * 
 */
public interface NodeViewersChangeListener
{
	/**
	 * @param newViewers
	 */
	public void nodeViewersChanged(List<ZooInspectorNodeViewer> newViewers);
}
