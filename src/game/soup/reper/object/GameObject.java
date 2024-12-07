package game.soup.reper.object;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import game.soup.reper.component.Component;
import game.soup.reper.component.Transform;

/**
 * @author Xibitol
 */
public abstract class GameObject {

	private Map<
		Class<? extends Component>,
		Component
	> components = new HashMap<>();

	public GameObject() {
		addComponent(new Transform());
	}

	// GETTERS
	public Component getComponent(
		Class<? extends Component> componentClass
	) {
		return components.get(componentClass);
	}
	public boolean hasComponent(Class<? extends Component> componentClass) {
		return components.containsKey(componentClass);
	}

	// SETTERS
	public boolean addComponent(Component component) {
		if(components.containsKey(component.getClass()))
			return false; // TODO: Warn.

		components.put(component.getClass(), component);
		return true;
	}
	public void removeComponent(Class<? extends Component> componentClass) {
		if(!components.containsKey(componentClass))
			throw new NoSuchElementException(
				"%s doesn't contain %s components.".formatted(
					getClass().getSimpleName(), componentClass.getSimpleName()
				)
			);

		components.remove(componentClass);
	}

	// FUNCTIONS
	public abstract void init();
	public final void update() {
		components.forEach((cl, co) -> co.update());
	}
}
