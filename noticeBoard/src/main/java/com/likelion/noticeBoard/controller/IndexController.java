package com.likelion.noticeBoard.controller;

import com.likelion.noticeBoard.dto.BoardDTO;
import com.likelion.noticeBoard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final BoardService boardService;

    @GetMapping("/")
    public String Index() {
        return "index";
    }
}
