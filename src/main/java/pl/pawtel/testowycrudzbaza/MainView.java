package pl.pawtel.testowycrudzbaza;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import pl.pawtel.testowycrudzbaza.repository.RegistryRepository;

@Route
public class MainView extends VerticalLayout {

    private RegistryRepository registryRepository;
    private Grid <Registry> grid;

    public MainView(RegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
        this.grid = new Grid<>(Registry.class);
        add(grid);
        listRegistries();
    }

    public void listRegistries() {
        grid.setItems(registryRepository.findAll());
    }
}
