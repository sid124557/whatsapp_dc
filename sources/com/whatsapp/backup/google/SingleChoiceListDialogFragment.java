package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03l;
import X.AnonymousClass0Z0;
import X.AnonymousClass5V0;
import X.C06730Yz;
import X.C16840u3;
import X.C19340zH;
import X.C69263Wi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class SingleChoiceListDialogFragment extends Hilt_SingleChoiceListDialogFragment {
    public C69263Wi A00;
    public C16840u3 A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public static /* synthetic */ void A00(DialogInterface dialogInterface, Bundle bundle, SingleChoiceListDialogFragment singleChoiceListDialogFragment, int i, int i2) {
        singleChoiceListDialogFragment.A01.Bbg(bundle.getStringArray("items"), i, i2);
        singleChoiceListDialogFragment.A02.set(true);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A02(DialogInterface dialogInterface, String str, String[] strArr, boolean[] zArr, int i, int i2) {
        if (zArr == null || zArr[i2]) {
            this.A01.Bbg(strArr, i, i2);
            this.A02.set(true);
            dialogInterface.dismiss();
        } else if (str != null) {
            this.A00.A0P(str, 0);
        }
    }

    public Dialog A1J(Bundle bundle) {
        String str;
        int length;
        int length2;
        Bundle bundle2 = this.A06;
        if (bundle2.containsKey("dialog_id")) {
            int i = bundle2.getInt("dialog_id");
            this.A02.set(false);
            C19340zH A002 = AnonymousClass5V0.A00(A0Q());
            A002.A0h(bundle2.getString("title"));
            A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            if (bundle2.containsKey("items") && bundle2.containsKey("multi_line_list_items_key")) {
                throw AnonymousClass001.A0e("Cannot provide both items and multi_line_list_items_key");
            } else if (bundle2.containsKey("items") || bundle2.containsKey("multi_line_list_items_key")) {
                int i2 = bundle2.getInt("selected_item_index", -1);
                if (bundle2.containsKey("items")) {
                    A002.A0K(new C06730Yz(bundle2, this, i), bundle2.getStringArray("items"), i2);
                } else if (bundle2.containsKey("multi_line_list_items_key")) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    String[] stringArray = bundle2.getStringArray("multi_line_list_items_key");
                    if (stringArray != null) {
                        String[] stringArray2 = bundle2.getStringArray("multi_line_list_item_values_key");
                        boolean[] booleanArray = bundle2.getBooleanArray("list_item_enabled_key");
                        String string = bundle2.getString("disabled_item_toast_key");
                        if (stringArray2 == null || (length = stringArray.length) == (length2 = stringArray2.length)) {
                            for (int i3 = 0; i3 < stringArray.length; i3++) {
                                HashMap A0t = AnonymousClass001.A0t();
                                A0t.put("line1", stringArray[i3]);
                                if (stringArray2 != null) {
                                    str = stringArray2[i3];
                                } else {
                                    str = null;
                                }
                                A0t.put("line2", str);
                                A0s.add(A0t);
                            }
                            A002.A0F(new AnonymousClass0Z0(this, string, stringArray, booleanArray, i), new AnonymousClass03l(A1D(), this, A0s, new int[]{16908308, 16908309}, new String[]{"line1", "line2"}, stringArray, booleanArray, i2), i2);
                        } else {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("keys.length = ");
                            A0o.append(length);
                            A0o.append(" ≠ ");
                            A0o.append(length2);
                            throw AnonymousClass000.A0F(" values.length", A0o);
                        }
                    } else {
                        throw AnonymousClass001.A0c("Must provide multi_line_list_items_key");
                    }
                }
                return A002.create();
            } else {
                throw AnonymousClass001.A0e("Must provide either items or multi_line_list_items_key");
            }
        } else {
            throw AnonymousClass001.A0e("dialog_id should be provided.");
        }
    }

    public void A1G(Context context) {
        super.A1G(context);
        try {
            this.A01 = (C16840u3) context;
        } catch (ClassCastException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1B(context, A0o);
            throw new ClassCastException(AnonymousClass000.A0X(" must implement SingleChoiceListListener", A0o));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle bundle = this.A06;
        if (this.A01 != null && !this.A02.get() && bundle.containsKey("dialog_id")) {
            this.A01.BRI(bundle.getInt("dialog_id"));
        }
    }
}
