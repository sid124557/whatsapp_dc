package X;

import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5eG  reason: invalid class name and case insensitive filesystem */
public class C109215eG implements ActionMode.Callback {
    public final /* synthetic */ C92324mU A00;

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        String str;
        if (menuItem != null) {
            C92324mU r4 = this.A00;
            int selectionStart = r4.getSelectionStart();
            int selectionEnd = r4.getSelectionEnd();
            if (selectionStart > selectionEnd) {
                int i = selectionEnd;
                selectionEnd = selectionStart;
                selectionStart = i;
            }
            int itemId = menuItem.getItemId();
            if (itemId == R.id.bold) {
                str = "*";
            } else if (itemId == R.id.italic) {
                str = "_";
            } else if (itemId == R.id.strikethrough) {
                str = "~";
            } else if (itemId == R.id.monospace) {
                str = "```";
            }
            Editable text = r4.getText();
            if (text == null) {
                return true;
            }
            while (selectionEnd > selectionStart) {
                int i2 = selectionEnd - 1;
                if (!Character.isSpaceChar(text.charAt(i2))) {
                    break;
                }
                selectionEnd = i2;
            }
            if (selectionEnd < text.length()) {
                char charAt = text.charAt(selectionEnd);
                if (!(Character.isSpaceChar(charAt) || charAt == '*' || charAt == '_' || charAt == '~')) {
                    text.insert(selectionEnd, " ");
                }
            }
            text.insert(selectionEnd, str);
            while (selectionStart < selectionEnd && Character.isSpaceChar(text.charAt(selectionStart))) {
                selectionStart++;
            }
            if (selectionStart > 0) {
                char charAt2 = text.charAt(selectionStart - 1);
                if (!(Character.isSpaceChar(charAt2) || charAt2 == '*' || charAt2 == '_' || charAt2 == '~')) {
                    text.insert(selectionStart, " ");
                    selectionStart++;
                }
            }
            text.insert(selectionStart, str);
            return true;
        }
        return false;
    }

    public C109215eG(C92324mU r1) {
        this.A00 = r1;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null) {
            return false;
        }
        MenuInflater menuInflater = actionMode.getMenuInflater();
        if (menuInflater != null) {
            menuInflater.inflate(R.menu.f10nameremoved, menu);
            return true;
        }
        Log.w("conversation-text-entry/action-mode-with-null-menu-inflater");
        return true;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
    }
}
