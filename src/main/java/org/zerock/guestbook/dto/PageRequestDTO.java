package org.zerock.guestbook.dto;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class PageRequestDTO {        // DTO 로 받기위한  설정

    private int page;
    private int size;
    
    private String type;
    private String keyword;
    
    
    public PageRequestDTO(){
    	this.page = 1;
    	this.size = 10;
    }
    public Pageable getPageable(Sort sort){
    	return PageRequest.of(page -1, size, sort);
    }
}
