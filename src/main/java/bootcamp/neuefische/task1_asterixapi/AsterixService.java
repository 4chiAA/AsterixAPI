package bootcamp.neuefische.task1_asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class AsterixService {

    private final CharacterRepo repo;
    private final IDService IDS;

    public Character saveOneCharacter(CharacterDTO character) {
        Character newCharacter = new Character(IDS.randomId(), character.name(), character.age(), character.occupation());
        return repo.save(newCharacter);
    }

    public List<Character> saveCharacters(List<Character> character){
        return repo.saveAll(character);
    }

    public Character getCharacterById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Character not found!"));
    }

    public List<Character> getCharacters() {
        return repo.findAll();
    }


}
