package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public interface ChapterWriter {

    Chapter write(LoreCore core);
}
