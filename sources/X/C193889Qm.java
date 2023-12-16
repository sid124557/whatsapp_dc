package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Qm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C193889Qm {
    public final /* synthetic */ PaymentTransactionHistoryActivity A00;

    public final void A00(AnonymousClass2T7 r7, String str, List list, List list2) {
        int i;
        String A0X;
        int i2;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A00;
        AnonymousClass95G r0 = paymentTransactionHistoryActivity.A0F;
        r0.A01 = list;
        r0.A05();
        ArrayList arrayList = paymentTransactionHistoryActivity.A0X;
        arrayList.clear();
        arrayList.addAll(list2);
        paymentTransactionHistoryActivity.A02.setVisibility(8);
        if (list.isEmpty()) {
            TextView textView = paymentTransactionHistoryActivity.A03;
            boolean z = r7.A05;
            boolean z2 = r7.A06;
            if (z) {
                if (!z2) {
                    boolean A1W = AnonymousClass000.A1W(r7.A00);
                    boolean isEmpty = TextUtils.isEmpty(str);
                    if (A1W) {
                        if (isEmpty) {
                            i2 = R.string.f11nameremoved;
                        } else {
                            i = R.string.f11nameremoved;
                            A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                            textView.setText(A0X);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (isEmpty) {
                        i2 = R.string.f11nameremoved;
                    } else {
                        i = R.string.f11nameremoved;
                        A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                        textView.setText(A0X);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (TextUtils.isEmpty(str)) {
                    i2 = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                    A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                    textView.setText(A0X);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (!z2) {
                boolean A1W2 = AnonymousClass000.A1W(r7.A00);
                boolean z3 = r7.A02;
                if (A1W2) {
                    if (!z3) {
                        boolean z4 = r7.A03;
                        boolean isEmpty2 = TextUtils.isEmpty(str);
                        if (z4) {
                            if (isEmpty2) {
                                i2 = R.string.f11nameremoved;
                            } else {
                                i = R.string.f11nameremoved;
                                A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                                textView.setText(A0X);
                                paymentTransactionHistoryActivity.A01.setVisibility(0);
                                return;
                            }
                        } else if (isEmpty2) {
                            i2 = R.string.f11nameremoved;
                        } else {
                            i = R.string.f11nameremoved;
                            A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                            textView.setText(A0X);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (TextUtils.isEmpty(str)) {
                        i2 = R.string.f11nameremoved;
                    } else {
                        i = R.string.f11nameremoved;
                        A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                        textView.setText(A0X);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (!z3) {
                    boolean z5 = r7.A03;
                    boolean isEmpty3 = TextUtils.isEmpty(str);
                    if (z5) {
                        if (isEmpty3) {
                            i2 = R.string.f11nameremoved;
                        } else {
                            i = R.string.f11nameremoved;
                            A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                            textView.setText(A0X);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (isEmpty3) {
                        i2 = R.string.f11nameremoved;
                    } else {
                        i = R.string.f11nameremoved;
                        A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                        textView.setText(A0X);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (TextUtils.isEmpty(str)) {
                    i2 = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                    A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                    textView.setText(A0X);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (!r7.A02) {
                boolean z6 = r7.A03;
                boolean isEmpty4 = TextUtils.isEmpty(str);
                if (z6) {
                    if (isEmpty4) {
                        i2 = R.string.f11nameremoved;
                    } else {
                        i = R.string.f11nameremoved;
                        A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                        textView.setText(A0X);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (isEmpty4) {
                    i2 = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                    A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                    textView.setText(A0X);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (TextUtils.isEmpty(str)) {
                i2 = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
                A0X = AnonymousClass0x2.A0X(paymentTransactionHistoryActivity, str, 1, i);
                textView.setText(A0X);
                paymentTransactionHistoryActivity.A01.setVisibility(0);
                return;
            }
            A0X = paymentTransactionHistoryActivity.getString(i2);
            textView.setText(A0X);
            paymentTransactionHistoryActivity.A01.setVisibility(0);
            return;
        }
        paymentTransactionHistoryActivity.A01.setVisibility(8);
        paymentTransactionHistoryActivity.A0C.A07(list);
    }

    public /* synthetic */ C193889Qm(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        this.A00 = paymentTransactionHistoryActivity;
    }
}
