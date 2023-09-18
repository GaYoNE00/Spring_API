package com.example.all4chat.Controller;

import com.example.all4chat.Service.All4Service;
import com.example.all4chat.dto.All4DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // 요청을 처리할 엔드포인트 경로 설정
@RequiredArgsConstructor
public class ExamController {

    @Autowired
    private final All4Service all4Service;

    @PostMapping("/search")
    public ResponseEntity<All4DTO> search(@RequestParam String team, @RequestParam String what) {
        All4DTO result = all4Service.ans(team, what);

        if (result != null) {
            return ResponseEntity.ok(result); // 데이터가 있을 경우 200 OK 응답 반환
        } else {
//            String message = "데이터가 없습니다"; // 사용자에게 반환할 메시지
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message); // 404 Not Found 응답과 메시지 반환        }
            return ResponseEntity.notFound().build(); // 데이터가 없을 경우 404 Not Found 응답 반환
        }
    }
}
