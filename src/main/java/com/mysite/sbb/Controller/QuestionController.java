package com.mysite.sbb.Controller;

import com.mysite.sbb.Dao.QuestionRepository;
import com.mysite.sbb.Domain.Question;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
@AllArgsConstructor
public class QuestionController {

//    @Autowired
//    private QuestionRepository questionRepository;

    private final QuestionRepository questionRepository;

//    @RequestMapping("/list")
//    @ResponseBody
//    public List<Question> showQuestions() {
//
//        return questionRepository.findAll();
//    }

    @RequestMapping("/list1")
    public String showQuestions1(Model model) {
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList",questionList);
        return "question_list";
    }
}
