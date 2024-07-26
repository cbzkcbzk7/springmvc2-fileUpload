package hello.upload.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : hello.upload.domain
 * fileName       : ItempRepository
 * author         : Sora
 * date           : 2024-07-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-26        Sora       최초 생성
 */
@Repository
public class ItempRepository {

    private final Map<Long, Item> store = new HashMap<>();
    private long sequence = 0L;
    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id){
        return store.get(id);
    }
}
