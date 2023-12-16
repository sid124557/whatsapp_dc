package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass0Uj;
import X.C18300x5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class WallpaperSetConfirmationDialogFragment extends Hilt_WallpaperSetConfirmationDialogFragment {
    public AnonymousClass0Uj A1V() {
        AnonymousClass0Uj A1V = super.A1V();
        TextView textView = (TextView) LayoutInflater.from(A0Q()).inflate(R.layout.f8nameremoved, (ViewGroup) null);
        textView.setText(R.string.f11nameremoved);
        A1V.setView(textView);
        View inflate = LayoutInflater.from(A0Q()).inflate(R.layout.f8nameremoved, (ViewGroup) null);
        C18300x5.A0G(inflate, R.id.wallpaper_confirmation_title_view).setText(R.string.f11nameremoved);
        A1V.A0P(inflate);
        return A1V;
    }
}
