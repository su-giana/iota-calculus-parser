package iota.types;

import iota.decl.Decl;
import iota.util.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Decls {
    private List<Decl> decls;
    public Decls(String jsonContext) {
        this.decls = new ArrayList<>();
        List<String> decls = JsonUtil.processJsonList(jsonContext);
        this.decls = JsonUtil.processJsonList(jsonContext).stream()
                .map(declJson -> Decl.fromJson(declJson))
                .toList();
    }

    public void print() {
        this.decls.stream()
                .forEach(decl -> {
                    decl.print();
                    System.out.println();
                });
    }
}
