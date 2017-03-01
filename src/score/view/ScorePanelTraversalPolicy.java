package score.view;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.util.Vector;

public class ScorePanelTraversalPolicy extends FocusTraversalPolicy
{
	Vector<Component> stuff;
	
	public ScorePanelTraversalPolicy(Vector<Component> stuff)
	{
		this.stuff = new Vector<Component>(stuff.size());
		this.stuff.addAll(stuff);
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component aComponent)
	{
		
		int idx = (stuff.indexOf(aComponent) + 1) % stuff.size();
		return stuff.get(idx);
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component aComponent)
	{
		int idx = stuff.indexOf(aComponent) - 1;
		if(idx < 0)
		{
			idx = stuff.size() -1;
		}
		return stuff.get(idx);
	}
	
	public Component getDefaultComponent(Container focusCycleRoot)
	{
		return stuff.get(0);
	}
	
	public Component getLastComponent(Container focusCycleRoot)
	{
		return stuff.lastElement();
	}
	
	public Component getFirstComponent(Container focusCycleRoot)
	{
		return stuff.get(0);
	}
}
