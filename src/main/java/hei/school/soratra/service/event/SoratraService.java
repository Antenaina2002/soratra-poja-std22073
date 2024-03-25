package hei.school.soratra.service.event;

import hei.school.soratra.repository.SoratraRepository;
import hei.school.soratra.repository.model.Soratra;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoratraService {

    private final SoratraRepository soratraRepository;

    public SoratraService(SoratraRepository soratraRepository) {
        this.soratraRepository = soratraRepository;
    }

    public Soratra savePhrase(String id, String phrasePoetique) {
        Soratra soratra = new Soratra();
        soratra.setId(id);
        soratra.setName(phrasePoetique);
        return soratraRepository.save(soratra);
    }

    public Soratra findById(String id) {
        return soratraRepository.findById(id).orElse(null);
    }
}
