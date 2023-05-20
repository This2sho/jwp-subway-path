package subway.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import subway.domain.Station;
import subway.repository.StationRepository;

public class StationRepositoryFake implements StationRepository {

    private static final HashMap<Long, Station> store = new HashMap<>();

    @Override
    public Station insert(final Station station) {
        store.put(station.getId(), station);
        return station;
    }

    @Override
    public List<Station> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Station findById(final Long id) {
        return store.get(id);
    }

    @Override
    public void update(final Station station) {
        store.put(station.getId(), station);
    }

    @Override
    public void deleteById(final Long id) {
        store.remove(id);
    }
}
