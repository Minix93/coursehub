package com.coursehub.business.controller.admin;

import com.coursehub.server.domain.Chapter;
import com.coursehub.server.dto.ChapterDto;
import com.coursehub.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/chapter")
    public List<ChapterDto> chapter(){

        return chapterService.list();
    }
}
