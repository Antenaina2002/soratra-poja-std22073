package hei.school.soratra.endpoint.rest.controller.health;

import hei.school.soratra.repository.model.Soratra;
import hei.school.soratra.service.event.SoratraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/soratra")
public class SoratraController {

    private final SoratraService soratraService;

    @Autowired
    public SoratraController(SoratraService soratraService) {
        this.soratraService = soratraService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateSoratra(@PathVariable String id, @RequestBody String phrasePoetique) {
        if (!phrasePoetique.equals(phrasePoetique.toLowerCase())) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        soratraService.savePhrase(id, phrasePoetique);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Soratra> getSoratra(@PathVariable String id) {
        Soratra soratra = soratraService.findById(id);
        if (soratra == null) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(soratra, HttpStatus.OK);
    }
}
