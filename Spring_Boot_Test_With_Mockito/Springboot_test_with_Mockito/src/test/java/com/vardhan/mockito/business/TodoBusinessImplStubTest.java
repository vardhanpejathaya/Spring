package com.vardhan.mockito.business;

import static org.junit.Assert.*;

import java.util.List;

import com.vardhan.mockito.data.api.TodoService;
import com.vardhan.mockito.data.api.TodoServiceStub;
import org.junit.Test;


public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(
                todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }

}
