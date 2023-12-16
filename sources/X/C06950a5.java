package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.whatsapp.R;

/* renamed from: X.0a5  reason: invalid class name and case insensitive filesystem */
public class C06950a5 implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener {
    public final Preference A00;

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.A00;
        CharSequence A04 = preference.A04();
        if (preference.A0Q && !TextUtils.isEmpty(A04)) {
            contextMenu.setHeaderTitle(A04);
            contextMenu.add(0, 0, 0, R.string.f11nameremoved).setOnMenuItemClickListener(this);
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.A00;
        Context context = preference.A05;
        CharSequence A04 = preference.A04();
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", A04));
        Toast.makeText(context, AnonymousClass002.A0F(context, A04, new Object[1], 0, R.string.f11nameremoved), 0).show();
        return true;
    }

    public C06950a5(Preference preference) {
        this.A00 = preference;
    }
}
