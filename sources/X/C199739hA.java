package X;

import com.whatsapp.payments.ui.widget.TransactionsExpandableView;

/* renamed from: X.9hA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199739hA implements Runnable {
    public final /* synthetic */ TransactionsExpandableView A00;

    public final void run() {
        TransactionsExpandableView transactionsExpandableView = this.A00;
        for (int i = 0; i < transactionsExpandableView.getChildCount(); i++) {
            C203239nL r0 = (C203239nL) transactionsExpandableView.A05.getChildAt(i);
            if (r0 != null) {
                r0.Biz();
            }
        }
    }

    public /* synthetic */ C199739hA(TransactionsExpandableView transactionsExpandableView) {
        this.A00 = transactionsExpandableView;
    }
}
