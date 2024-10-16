import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.markup.HighlighterLayer;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.editor.markup.TextAttributesKey;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

public class Highlighter extends AnAction{

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        Messages.showMessageDialog("Hello", "Highlighter", Messages.getInformationIcon());

        Editor editor = anActionEvent.getData(PlatformDataKeys.EDITOR);

        String selectedText = editor.getSelectionModel().getSelectedText();
        if (selectedText == null || selectedText.isEmpty()) return;

        TextRange selectionRange = editor.getSelectionModel().getSelection();
        if (selectionRange == null) return;

        TextAttributes attributes = new TextAttributes(null, null, null, null, null, null, HighlighterLayer.SELECTION);
        attributes = attributes.derive(TextAttributes.BOLD, true);
        attributes = attributes.deriveForeground(0xFF0000);

        editor.getMarkupModel().addRangeHighlighter(selectionRange, HIGHLIGHT_KEY, attributes, HighlighterLayer.SELECTION);

    }

    @Override
    public boolean isDumbAware() {
        return false;
    }
}