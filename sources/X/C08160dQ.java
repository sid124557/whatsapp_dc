package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: X.0dQ  reason: invalid class name and case insensitive filesystem */
public class C08160dQ implements AnonymousClass0u4 {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ ActionBarContextView A02;

    public void BMP(View view) {
        this.A01 = true;
    }

    public C08160dQ(ActionBarContextView actionBarContextView) {
        this.A02 = actionBarContextView;
    }

    public void BMQ(View view) {
        if (!this.A01) {
            ActionBarContextView actionBarContextView = this.A02;
            actionBarContextView.A0C = null;
            C08160dQ.super.setVisibility(this.A00);
        }
    }

    public void BMS(View view) {
        C08160dQ.super.setVisibility(0);
        this.A01 = false;
    }
}
