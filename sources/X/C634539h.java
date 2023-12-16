package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.webkit.URLUtil;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.util.DocumentWarningDialogFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.39h  reason: invalid class name and case insensitive filesystem */
public class C634539h implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C634539h(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = z;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        DialogFragment A002;
        int i;
        AnonymousClass1nF r9;
        AnonymousClass33C r1;
        switch (this.A03) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                boolean z = this.A02;
                C95814uZ r2 = (C95814uZ) this.A01;
                AnonymousClass214 r12 = AnonymousClass214.INFO;
                if (z) {
                    A002 = AnonymousClass26H.A00((C95814uZ) null, r12, (Boolean) null);
                } else {
                    A002 = AnonymousClass26I.A00(r2, contactInfoActivity.A1i, r12);
                }
                contactInfoActivity.Bon(A002, (String) null);
                return;
            case 1:
                boolean z2 = this.A02;
                C19300zA r22 = (C19300zA) this.A00;
                C166007xz r5 = (C166007xz) this.A01;
                if (z2) {
                    C48212eX privacyDisclosureLogger = r22.getPrivacyDisclosureLogger();
                    int i2 = r22.A00;
                    switch (r22.A01) {
                        case 0:
                            i = 1014;
                            break;
                        case 1:
                            i = 1015;
                            break;
                        case 2:
                            i = 1016;
                            break;
                        case 3:
                            i = 1017;
                            break;
                        case 4:
                            i = 1018;
                            break;
                        case 5:
                            i = 1019;
                            break;
                        case 6:
                            i = 1020;
                            break;
                        case 7:
                            i = 1021;
                            break;
                        case 8:
                            i = 1022;
                            break;
                        case 9:
                            i = 1023;
                            break;
                    }
                    privacyDisclosureLogger.A01(AnonymousClass5W0.A06, i2, Integer.valueOf(i).intValue());
                }
                Context context = r22.getContext();
                if (context != null) {
                    List list = C59992xp.A02;
                    String str = r5.A00;
                    if (list.contains(str)) {
                        AnonymousClass58Y r3 = AnonymousClass58Y.RESULT_OK;
                        int hashCode = str.hashCode();
                        if (hashCode != 2524) {
                            if (hashCode != 2094604) {
                                if (hashCode != 79219778 && hashCode == 1924835592 && str.equals("ACCEPT")) {
                                    r3 = AnonymousClass58Y.RESULT_ACCEPT;
                                }
                            } else if (str.equals("DENY")) {
                                r3 = AnonymousClass58Y.RESULT_DENY;
                            }
                        }
                        AnonymousClass5BZ.A00(r22.A0J, r3);
                        return;
                    } else if (URLUtil.isHttpsUrl(str)) {
                        r22.getLinkLauncher().BkW(context, Uri.parse(str), (C624134x) null);
                        return;
                    } else {
                        AnonymousClass5BZ.A00(r22.A0J, AnonymousClass58Y.RESULT_OK);
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                C117015rF r52 = (C117015rF) this.A01;
                boolean z3 = this.A02;
                AnonymousClass4UX r4 = ((C87974Wv) this.A00).A09;
                if (z3) {
                    boolean A003 = r4.A03.A00(r52);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Reaction=");
                    A0o.append(r52);
                    C626936e.A0D(A003, AnonymousClass000.A0X(" was not removed from allTab!", A0o));
                    Iterator A0q = C18320x8.A0q(r4.A06.A07());
                    while (A0q.hasNext()) {
                        AnonymousClass5OD r32 = (AnonymousClass5OD) A0q.next();
                        if (((List) r32.A02.A07()).contains(r52)) {
                            C626936e.A0D(r32.A00(r52), AnonymousClass000.A0P(r32, " was not removed from emojiTab=", AnonymousClass000.A0k(r52, "Reaction=")));
                            C624134x A004 = C55122pp.A00(r4.A04, r52.A00);
                            if (A004 != null) {
                                r4.A01.A0a(A004, "", true);
                                return;
                            }
                            return;
                        }
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Could not find emoji tab for reaction=");
                    A0o2.append(r52);
                    A0o2.append(". That should not happen.");
                    C18270x1.A0z(A0o2);
                    return;
                }
                r4.A08.A0H(r52.A04);
                return;
            default:
                boolean z4 = this.A02;
                DocumentWarningDialogFragment documentWarningDialogFragment = (DocumentWarningDialogFragment) this.A00;
                if (z4) {
                    long j = documentWarningDialogFragment.A0H().getLong("message_id");
                    C55832qz r0 = documentWarningDialogFragment.A06;
                    if (r0 != null) {
                        C624134x A005 = C55122pp.A00(r0, j);
                        if (!(A005 instanceof AnonymousClass1nF) || (r9 = (AnonymousClass1nF) A005) == null || (r1 = r9.A01) == null) {
                            C69263Wi r23 = documentWarningDialogFragment.A03;
                            if (r23 != null) {
                                r23.A0I(R.string.f11nameremoved, 0);
                            } else {
                                throw C18270x1.A0S("globalUI");
                            }
                        } else {
                            C69263Wi r7 = documentWarningDialogFragment.A03;
                            if (r7 != null) {
                                C55682qk r6 = documentWarningDialogFragment.A02;
                                if (r6 != null) {
                                    AnonymousClass4FS r10 = documentWarningDialogFragment.A07;
                                    if (r10 != null) {
                                        C48042eF r8 = documentWarningDialogFragment.A05;
                                        if (r8 != null) {
                                            Context A0G = documentWarningDialogFragment.A0G();
                                            C111095hX r53 = documentWarningDialogFragment.A01;
                                            if (r53 != null) {
                                                AnonymousClass5b1.A04(A0G, r53, r6, r7, r8, r9, r10);
                                                r1.A07 = 2;
                                                C66543Lv r02 = documentWarningDialogFragment.A04;
                                                if (r02 != null) {
                                                    r02.A0Y(A005);
                                                } else {
                                                    throw C18270x1.A0S("coreMessageStore");
                                                }
                                            } else {
                                                throw C18270x1.A0S("activityUtils");
                                            }
                                        } else {
                                            throw C18270x1.A0S("sharedMediaIdsStore");
                                        }
                                    } else {
                                        throw C18270x1.A0S("waWorkers");
                                    }
                                } else {
                                    throw C18270x1.A0S("crashLogs");
                                }
                            } else {
                                throw C18270x1.A0S("globalUI");
                            }
                        }
                    } else {
                        throw C18270x1.A0S("fMessageDatabase");
                    }
                }
                AnonymousClass043 r03 = documentWarningDialogFragment.A00;
                if (r03 != null) {
                    r03.dismiss();
                }
                documentWarningDialogFragment.A00 = null;
                return;
        }
    }
}
