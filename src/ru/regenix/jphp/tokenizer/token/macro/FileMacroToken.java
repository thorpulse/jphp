package ru.regenix.jphp.tokenizer.token.macro;

import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.token.TokenMeta;

public class FileMacroToken extends MacroToken {
    public FileMacroToken(TokenMeta meta) {
        super(meta, TokenType.T_FILE);
    }
}