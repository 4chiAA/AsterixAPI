package bootcamp.neuefische.task1_asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asterix")
@RequiredArgsConstructor
public class AsterixController {

    private final AsterixService service;

    @GetMapping("/character/{id}")
    public Character getCharacterById(@PathVariable String id){
        return service.getCharacterById(id);
    }

    @GetMapping("/characters")
    public List<Character> getCharacters(){
        return service.getCharacters();
    }

    @PostMapping("/character")
    public Character saveOneCharacter(@RequestBody CharacterDTO character){
        return service.saveOneCharacter(character);
    }

    @PostMapping("/characters")
    public List<Character> saveCharacters(@RequestBody List<Character> character){
        return service.saveCharacters(character);
    }
}
