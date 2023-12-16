package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.status.advertise.AdvertiseViewModel;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.69x  reason: invalid class name and case insensitive filesystem */
public class C1238269x implements AnonymousClass658 {
    public Object A00;
    public final int A01;

    public C1238269x(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BPS(Object obj) {
        List list;
        C06270Wx r0;
        C997157s r02;
        C986752u r1;
        List A0h;
        switch (this.A01) {
            case 0:
                AnonymousClass4Z3 r7 = (AnonymousClass4Z3) this.A00;
                C149487Mq r11 = (C149487Mq) obj;
                AnonymousClass5WD r3 = r11.A00;
                AnonymousClass7LM r5 = r3.A00;
                r7.A02 = r5.A01;
                r7.A03 = r5.A02;
                WebPagePreviewView webPagePreviewView = r7.A09;
                webPagePreviewView.setLinkTitleTypeface(C18310x6.A02(r7.A01 instanceof C30441mS ? 1 : 0));
                webPagePreviewView.setLinkTitle(r11.A02);
                webPagePreviewView.setLinkSnippet(r11.A01);
                r7.A07.setText(r11.A03);
                if (r3.A01.booleanValue()) {
                    r7.A0A.A08.A0A(webPagePreviewView.A0Q, r7.A01, new C100465Ba(r7, 15));
                } else {
                    webPagePreviewView.A0Q.setVisibility(0);
                    ThumbnailButton thumbnailButton = webPagePreviewView.A0Q;
                    C107335b8.A0C(thumbnailButton.getContext(), thumbnailButton, R.drawable.ic_group_invite_link, R.color.f5nameremoved);
                    webPagePreviewView.A0Q.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    webPagePreviewView.A0Q.setScaleX(1.5f);
                    webPagePreviewView.A0Q.setScaleY(1.5f);
                    ThumbnailButton thumbnailButton2 = webPagePreviewView.A0Q;
                    C86604Kt.A0z(thumbnailButton2.getContext(), thumbnailButton2, R.color.f5nameremoved);
                }
                webPagePreviewView.setLinkHostname(r5.A00);
                return;
            case 1:
                r0 = ((C91534kK) this.A00).A05;
                list = obj;
                break;
            case 2:
                AdvertiseViewModel advertiseViewModel = (AdvertiseViewModel) this.A00;
                List list2 = (List) obj;
                C162457s7.A0H(list2);
                List list3 = advertiseViewModel.A02;
                boolean z = false;
                if (list2.size() == list3.size()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(list3));
                    for (Object next : list3) {
                        linkedHashMap.put(((C624134x) next).A1J.A01, next);
                    }
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!linkedHashMap.containsKey(C86614Ku.A0h(it).A01)) {
                                }
                            }
                        }
                    }
                    z = true;
                }
                advertiseViewModel.A02 = list2;
                if (!z) {
                    r0 = advertiseViewModel.A04;
                    list = list2;
                    break;
                } else {
                    return;
                }
            case 3:
                C162457s7.A0J(obj, 1);
                r0 = ((StatusesViewModel) this.A00).A05;
                list = obj;
                break;
            case 4:
                r0 = (C06270Wx) this.A00;
                list = obj;
                break;
            case 5:
                AnonymousClass0x7.A18(((UpdatesViewModel) this.A00).A00);
                return;
            case 6:
                UpdatesViewModel updatesViewModel = (UpdatesViewModel) this.A00;
                int A07 = C86644Kx.A07((Number) obj);
                AnonymousClass08J r52 = updatesViewModel.A0P;
                UpdatesAdvertiseViewModel updatesAdvertiseViewModel = updatesViewModel.A0c;
                boolean z2 = updatesViewModel.A0D;
                Object A072 = r52.A07();
                if (A07 == 0) {
                    r1 = null;
                } else {
                    AnonymousClass0XV r8 = updatesAdvertiseViewModel.A00;
                    Boolean bool = (Boolean) r8.A04("KEY_STATUS_MAIN_HAS_SHOWN_ADVERTISE_BANNER");
                    if (bool == null) {
                        C183538qC r6 = updatesAdvertiseViewModel.A02.A01;
                        r8.A06("KEY_STATUS_MAIN_HAS_SHOWN_ADVERTISE_BANNER", Boolean.valueOf(C18300x5.A0B(r6).getBoolean("pref_advertise_banner_status_main_shown", false)));
                        bool = Boolean.valueOf(C18300x5.A0B(r6).getBoolean("pref_advertise_banner_status_main_shown", false));
                    }
                    if (bool.booleanValue() || !updatesAdvertiseViewModel.A03.A03(AnonymousClass588.ADVERTISE)) {
                        r02 = C997157s.Button;
                    } else {
                        r02 = C997157s.Banner;
                    }
                    r1 = new C986752u(r02);
                    if (z2 && A072 == null) {
                        updatesAdvertiseViewModel.A0D(r1);
                    }
                }
                r52.A0G(r1);
                return;
            case 7:
                r0 = ((UpdatesViewModel) this.A00).A0R;
                list = obj;
                break;
            default:
                UpdatesViewModel updatesViewModel2 = (UpdatesViewModel) this.A00;
                Collection collection = (Collection) obj;
                if (updatesViewModel2.A0a.A02()) {
                    List<Object> list4 = updatesViewModel2.A0n;
                    Set A0P = C73723fy.A0P(list4);
                    AnonymousClass08M r72 = updatesViewModel2.A0T;
                    C162457s7.A0H(collection);
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (Object next2 : collection) {
                        if (!A0P.contains(((AnonymousClass536) next2).A03.A05())) {
                            A0s.add(next2);
                        }
                    }
                    r72.A0H(A0s);
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    for (Object next3 : collection) {
                        if (A0P.contains(((AnonymousClass536) next3).A03.A05())) {
                            A0s2.add(next3);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C57692u3.A01(A0s2));
                    Iterator it2 = A0s2.iterator();
                    while (it2.hasNext()) {
                        Object next4 = it2.next();
                        C95814uZ A05 = ((AnonymousClass536) next4).A03.A05();
                        C162457s7.A0D(A05);
                        linkedHashMap2.put(A05, next4);
                    }
                    AnonymousClass08M r32 = updatesViewModel2.A0S;
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    for (Object obj2 : list4) {
                        Object obj3 = linkedHashMap2.get(obj2);
                        if (obj3 != null) {
                            A0s3.add(obj3);
                        }
                    }
                    r32.A0H(A0s3);
                } else {
                    updatesViewModel2.A0T.A0H(collection);
                }
                C102715Jz r62 = updatesViewModel2.A0i;
                boolean z3 = r62.A00;
                r62.A00 = false;
                if (z3) {
                    boolean z4 = updatesViewModel2.A0G;
                    boolean z5 = false;
                    if (!updatesViewModel2.A0A && (A0h = C86644Kx.A0h(updatesViewModel2.A0T)) != null && A0h.isEmpty() && C18270x1.A1V(r62.A04)) {
                        z5 = true;
                    }
                    updatesViewModel2.A0G = z5;
                    if (z5 != z4) {
                        updatesViewModel2.A0M(false);
                    }
                }
                if (collection != null && (!collection.isEmpty())) {
                    updatesViewModel2.A0J();
                    return;
                }
                return;
        }
        r0.A0G(list);
    }
}
