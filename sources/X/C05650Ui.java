package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Ui  reason: invalid class name and case insensitive filesystem */
public class C05650Ui {
    public static int A02;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A00(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER /*64*/:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case ZipDecompressor.UNZIP_BUFFER_SIZE /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case DefaultCrypto.BUFFER_SIZE /*8192*/:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case AnonymousClass35S.A0F /*131072*/:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0023
            r2 = 0
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5 instanceof X.C05650Ui
            if (r0 == 0) goto L_0x0014
            X.0Ui r5 = (X.C05650Ui) r5
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.A01
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A01
            if (r1 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x001c
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001c
            return r2
        L_0x001c:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0023
            return r2
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05650Ui.equals(java.lang.Object):boolean");
    }

    public CharSequence A01() {
        if (!(!A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.A01.getText();
        }
        List A03 = A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List A032 = A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List A033 = A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List A034 = A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < A03.size(); i++) {
            spannableString.setSpan(new AnonymousClass02E(this, AnonymousClass000.A09(A034, i), AnonymousClass0IF.A00(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), AnonymousClass000.A09(A03, i), AnonymousClass000.A09(A032, i), AnonymousClass000.A09(A033, i));
        }
        return spannableString;
    }

    public List A02() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.A01.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            A0s.add(new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, actionList.get(i), 0));
        }
        return A0s;
    }

    public final List A03(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        ArrayList<Integer> integerArrayList = AnonymousClass0IF.A00(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass0IF.A00(accessibilityNodeInfo).putIntegerArrayList(str, A0s);
        return A0s;
    }

    public final void A04(int i, boolean z) {
        Bundle A002 = AnonymousClass0IF.A00(this.A01);
        if (A002 != null) {
            int i2 = A002.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            A002.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void A05(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A01.setTraversalAfter(view);
        }
    }

    public void A06(View view, CharSequence charSequence) {
        int length;
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
            AnonymousClass0IF.A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            AnonymousClass0IF.A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            AnonymousClass0IF.A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            AnonymousClass0IF.A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    if (((Reference) sparseArray.valueAt(i2)).get() == null) {
                        A0s.add(Integer.valueOf(i2));
                    }
                }
                for (int i3 = 0; i3 < A0s.size(); i3++) {
                    sparseArray.remove(AnonymousClass001.A0K(A0s.get(i3)));
                }
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, charSequence.length(), ClickableSpan.class);
                if (clickableSpanArr != null && (length = clickableSpanArr.length) > 0) {
                    AnonymousClass0IF.A00(accessibilityNodeInfo).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i4 = 0;
                    do {
                        ClickableSpan clickableSpan = clickableSpanArr[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                i = A02;
                                A02 = i + 1;
                                break;
                            } else if (clickableSpan.equals(((Reference) sparseArray2.valueAt(i5)).get())) {
                                i = sparseArray2.keyAt(i5);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(clickableSpanArr[i4]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i4];
                        A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        A03("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                        i4++;
                    } while (i4 < length);
                }
            }
        }
    }

    public void A07(C06220Ws r3) {
        this.A01.addAction((AccessibilityNodeInfo.AccessibilityAction) r3.A03);
    }

    public void A08(C06220Ws r3) {
        this.A01.removeAction((AccessibilityNodeInfo.AccessibilityAction) r3.A03);
    }

    public void A09(CharSequence charSequence) {
        this.A01.setContentDescription(charSequence);
    }

    public void A0A(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(charSequence);
        } else {
            AnonymousClass0IF.A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void A0B(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            AnonymousClass0IF.A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void A0C(CharSequence charSequence) {
        AnonymousClass0IF.A00(this.A01).putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void A0E(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (i >= 28) {
            accessibilityNodeInfo.setTooltipText(charSequence);
        } else {
            AnonymousClass0IF.A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void A0F(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((AnonymousClass0KO) obj).A00;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void A0G(Object obj) {
        this.A01.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((AnonymousClass0KP) obj).A00);
    }

    public void A0H(boolean z) {
        this.A01.setClickable(z);
    }

    public void A0I(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A01.setHeading(z);
        } else {
            A04(2, z);
        }
    }

    public void A0J(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A01.setScreenReaderFocusable(z);
        } else {
            A04(1, z);
        }
    }

    public void A0K(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.A01.setShowingHintText(z);
        } else {
            A04(4, z);
        }
    }

    public boolean A0L() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.A01.isShowingHintText();
        }
        Bundle A002 = AnonymousClass0IF.A00(this.A01);
        if (A002 == null || (A002.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A01);
    }

    public C05650Ui(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    public void A0D(CharSequence charSequence) {
        boolean A002 = AnonymousClass0WZ.A00();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (A002) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            AnonymousClass0IF.A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String toString() {
        String string;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.toString());
        Rect A0N = AnonymousClass001.A0N();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        accessibilityNodeInfo.getBoundsInParent(A0N);
        A0o.append(AnonymousClass000.A0P(A0N, "; boundsInParent: ", AnonymousClass001.A0o()));
        accessibilityNodeInfo.getBoundsInScreen(A0N);
        A0o.append(AnonymousClass000.A0P(A0N, "; boundsInScreen: ", AnonymousClass001.A0o()));
        A0o.append("; packageName: ");
        A0o.append(accessibilityNodeInfo.getPackageName());
        A0o.append("; className: ");
        A0o.append(accessibilityNodeInfo.getClassName());
        A0o.append("; text: ");
        A0o.append(A01());
        A0o.append("; contentDescription: ");
        A0o.append(accessibilityNodeInfo.getContentDescription());
        A0o.append("; viewId: ");
        A0o.append(accessibilityNodeInfo.getViewIdResourceName());
        A0o.append("; uniqueId: ");
        if (AnonymousClass0WZ.A01()) {
            string = accessibilityNodeInfo.getUniqueId();
        } else {
            string = AnonymousClass0IF.A00(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        A0o.append(string);
        A0o.append("; checkable: ");
        A0o.append(accessibilityNodeInfo.isCheckable());
        A0o.append("; checked: ");
        A0o.append(accessibilityNodeInfo.isChecked());
        A0o.append("; focusable: ");
        A0o.append(accessibilityNodeInfo.isFocusable());
        A0o.append("; focused: ");
        A0o.append(accessibilityNodeInfo.isFocused());
        A0o.append("; selected: ");
        A0o.append(accessibilityNodeInfo.isSelected());
        A0o.append("; clickable: ");
        A0o.append(accessibilityNodeInfo.isClickable());
        A0o.append("; longClickable: ");
        A0o.append(accessibilityNodeInfo.isLongClickable());
        A0o.append("; enabled: ");
        A0o.append(accessibilityNodeInfo.isEnabled());
        A0o.append("; password: ");
        A0o.append(accessibilityNodeInfo.isPassword());
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("; scrollable: ");
        A0o2.append(accessibilityNodeInfo.isScrollable());
        AnonymousClass000.A1B(A0o2, A0o);
        A0o.append("; [");
        List A022 = A02();
        for (int i = 0; i < A022.size(); i++) {
            C06220Ws r2 = (C06220Ws) A022.get(i);
            String A002 = A00(((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getId());
            if (A002.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getLabel() != null) {
                A002 = ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getLabel().toString();
            }
            A0o.append(A002);
            if (i != AnonymousClass002.A03(A022)) {
                AnonymousClass001.A1M(A0o);
            }
        }
        return AnonymousClass000.A0f(A0o);
    }
}
