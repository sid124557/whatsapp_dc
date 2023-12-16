package X;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: X.04a  reason: invalid class name and case insensitive filesystem */
public class C003604a extends C07190aT {
    public final /* synthetic */ ActionMenuItemView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C003604a(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.A00 = actionMenuItemView;
    }

    public C16920uF A00() {
        AnonymousClass04N r0;
        C02530Gp r02 = this.A00.A04;
        if (r02 == null || (r0 = ((AnonymousClass04G) r02).A00.A0D) == null) {
            return null;
        }
        return r0.A00();
    }

    public boolean A03() {
        C16920uF A002;
        ActionMenuItemView actionMenuItemView = this.A00;
        C15560rZ r2 = actionMenuItemView.A05;
        if (r2 == null || !r2.BGr(actionMenuItemView.A06) || (A002 = A00()) == null || !A002.BIy()) {
            return false;
        }
        return true;
    }
}
