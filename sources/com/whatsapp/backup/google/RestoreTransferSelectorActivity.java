package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08P;
import X.AnonymousClass0DC;
import X.AnonymousClass0XL;
import X.AnonymousClass1VW;
import X.AnonymousClass36l;
import X.AnonymousClass4GQ;
import X.AnonymousClass5V0;
import X.AnonymousClass8UF;
import X.C005205m;
import X.C09920gy;
import X.C107575bX;
import X.C14310pI;
import X.C15930sC;
import X.C162457s7;
import X.C17760wC;
import X.C17770wD;
import X.C19340zH;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public final class RestoreTransferSelectorActivity extends AnonymousClass0DC {
    public AnonymousClass08P A00;
    public AnonymousClass1VW A01;
    public final List A02 = AnonymousClass001.A0s();

    public final Spanned A74(String str) {
        String string;
        if (str != null) {
            string = AnonymousClass002.A0F(this, str, new Object[1], 0, R.string.f11nameremoved);
        } else {
            string = getString(R.string.f11nameremoved);
        }
        C162457s7.A0H(string);
        String string2 = getString(R.string.f11nameremoved);
        C162457s7.A0D(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(string);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
        spannableStringBuilder.append("\n");
        spannableStringBuilder.append(string2);
        return spannableStringBuilder;
    }

    public static final void A0C(RestoreTransferSelectorActivity restoreTransferSelectorActivity) {
        Log.i("restore>RestoreTransferSelectorActivity/Skip confirmed");
        restoreTransferSelectorActivity.setResult(3);
        restoreTransferSelectorActivity.finish();
    }

    public static /* synthetic */ void A0Z(RestoreTransferSelectorActivity restoreTransferSelectorActivity, int i) {
        AnonymousClass08P r0 = restoreTransferSelectorActivity.A00;
        if (r0 != null) {
            r0.A0D(i);
        }
    }

    public static /* synthetic */ void A0a(RestoreTransferSelectorActivity restoreTransferSelectorActivity, int i) {
        AnonymousClass08P r0 = restoreTransferSelectorActivity.A00;
        if (r0 != null) {
            r0.A0D(i);
        }
    }

    public static final /* synthetic */ void A0b(RestoreTransferSelectorActivity restoreTransferSelectorActivity, List list) {
        View view;
        int i;
        List list2 = restoreTransferSelectorActivity.A02;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) list2.get(i2);
            int A09 = AnonymousClass000.A09(list, i2);
            if (A09 == 0) {
                view2.setBackgroundResource(R.drawable.selector_item_bg);
                view = (View) list2.get(i2);
                i = 0;
                view.setOnClickListener(new C17770wD(restoreTransferSelectorActivity, i2, i));
            } else if (A09 == 1) {
                view2.setBackgroundResource(R.drawable.selector_item_bg_selected);
                view = (View) list2.get(i2);
                i = 1;
                view.setOnClickListener(new C17770wD(restoreTransferSelectorActivity, i2, i));
            } else if (A09 == 2) {
                view2.setBackgroundResource(R.drawable.selector_item_bg);
                view2.setAlpha(0.3f);
            }
        }
    }

    public final AnonymousClass1VW A75() {
        AnonymousClass1VW r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C162457s7.A0M("abPreChatdProps");
        throw AnonymousClass000.A0L();
    }

    public final void A76() {
        AnonymousClass08P r0 = this.A00;
        if (r0 != null) {
            int i = r0.A00;
            if (Integer.valueOf(i) != null) {
                if (i == 0) {
                    Log.i("restore>RestoreTransferSelectorActivity/User selected the restore option");
                    setResult(1);
                } else if (i == 1) {
                    Log.i("restore>RestoreTransferSelectorActivity/User selected the transfer option");
                    setResult(2);
                }
            }
        }
        finish();
    }

    public final void A77() {
        Log.i("restore>RestoreTransferSelectorActivity/Skip clicked");
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0d(this, new C09920gy(this, 22), R.string.f11nameremoved);
        A002.A0c(this, (C15930sC) null, R.string.f11nameremoved);
        A002.A0i(true);
        A002.create().show();
    }

    public static final void A0c(AnonymousClass4GQ r0, Object obj) {
        r0.invoke(obj);
    }

    public void onCreate(Bundle bundle) {
        String str;
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass36l.A0M(this, A75(), R.id.title);
        View A002 = C005205m.A00(this, R.id.restore_option);
        C162457s7.A0D(A002);
        ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) A002;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = extras.getString("backup_time");
        } else {
            str = null;
        }
        listItemWithLeftIcon.A06(A74(str), false);
        View A003 = C005205m.A00(this, R.id.transfer_option);
        C162457s7.A0D(A003);
        ((ListItemWithLeftIcon) A003).A06(C107575bX.A02(getString(R.string.f11nameremoved), new Object[0]), false);
        Integer[] numArr = new Integer[2];
        if (str != null) {
            AnonymousClass000.A1P(numArr, 1, 0);
            i = 0;
        } else {
            AnonymousClass000.A1P(numArr, 2, 0);
            i = 1;
        }
        numArr[1] = i;
        List A0o = AnonymousClass8UF.A0o(numArr);
        List list = this.A02;
        list.add(listItemWithLeftIcon);
        View A004 = C005205m.A00(this, R.id.transfer_option);
        C162457s7.A0D(A004);
        list.add(A004);
        View A005 = C005205m.A00(this, R.id.continue_button);
        C162457s7.A0D(A005);
        C17760wC.A00(A005, this, 19);
        View A006 = C005205m.A00(this, R.id.skip_button);
        C162457s7.A0D(A006);
        C17760wC.A00(A006, this, 20);
        AnonymousClass08P r0 = (AnonymousClass08P) new AnonymousClass0XL(this).A01(AnonymousClass08P.class);
        this.A00 = r0;
        if (r0 != null) {
            r0.A02.A0B(this, new C09920gy(new C14310pI(this), 21));
        }
        AnonymousClass08P r4 = this.A00;
        if (r4 != null && !r4.A01) {
            int size = A0o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (AnonymousClass000.A09(A0o, i2) == 1) {
                    r4.A00 = i2;
                    break;
                } else {
                    i2++;
                }
            }
            r4.A02.A0G(A0o);
            r4.A01 = true;
        }
    }
}
