package hello.upload.domain;

import lombok.Data;

import java.util.List;

/**
 * packageName    : hello.upload.domain
 * fileName       : Item
 * author         : Sora
 * date           : 2024-07-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-26        Sora       최초 생성
 */
@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;


}
