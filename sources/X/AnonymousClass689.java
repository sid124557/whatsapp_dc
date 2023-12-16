package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.689  reason: invalid class name */
public class AnonymousClass689 extends C111445i6 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass689(C111095hX r2, C159027ky r3, C69263Wi r4, C56972sr r5, C29411im r6, C29301ib r7, AnonymousClass5UX r8, C64773Ex r9, C29421in r10, AnonymousClass5ZU r11, C114015mM r12, C613330g r13, C56612sH r14, AnonymousClass5ZR r15, C620733j r16, C29431io r17, C29241iV r18, C621233o r19, C28071fd r20, C61222zu r21, Object obj, int i) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        this.A01 = i;
        this.A00 = obj;
    }

    public C105905Ww A0A() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C105415Uv r0 = ((GroupChatLiveLocationsActivity2) obj).A06;
            if (r0 != null) {
                return new C105905Ww(r0.A00());
            }
            return null;
        }
        C110885hC r02 = ((GroupChatLiveLocationsActivity) obj).A05;
        if (r02 != null) {
            return new C105905Ww(r02.A0S);
        }
        return null;
    }

    public void A0C() {
        int i = this.A01;
        super.A0C();
        Object obj = this.A00;
        if (i != 0) {
            ((GroupChatLiveLocationsActivity2) obj).A76();
        } else {
            ((GroupChatLiveLocationsActivity) obj).A76();
        }
    }

    public void A0K() {
        C110885hC r3;
        AnonymousClass7UM r2;
        LatLng latLng;
        C105415Uv r22;
        AnonymousClass7BU A012;
        if (this.A01 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            if (!(!groupChatLiveLocationsActivity2.A0E) && groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0X) {
                C111445i6 r1 = groupChatLiveLocationsActivity2.A0O;
                if (r1.A0o == null || this.A0t) {
                    C105735We r0 = r1.A0l;
                    if (r0 != null) {
                        latLng = r0.A00();
                        if (!groupChatLiveLocationsActivity2.A06.A00().A02().A04.A00(latLng)) {
                            C111445i6 r12 = groupChatLiveLocationsActivity2.A0O;
                            if (!r12.A0t) {
                                groupChatLiveLocationsActivity2.A0X = true;
                                r22 = groupChatLiveLocationsActivity2.A06;
                                A012 = C106555Zl.A01(latLng);
                            } else if (groupChatLiveLocationsActivity2.A7A(r12.A0l.A00())) {
                                groupChatLiveLocationsActivity2.A0O.A0C();
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!r1.A0u) {
                        groupChatLiveLocationsActivity2.A79(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    groupChatLiveLocationsActivity2.A0X = true;
                    C54942pX r23 = groupChatLiveLocationsActivity2.A0O.A0o;
                    latLng = AnonymousClass4L0.A0H(r23.A00, r23.A01);
                    float A74 = groupChatLiveLocationsActivity2.A74(r23.A02, -1.0f);
                    if (A74 <= groupChatLiveLocationsActivity2.A06.A02().A02 && A74 != -1.0f) {
                        r22 = groupChatLiveLocationsActivity2.A06;
                        A012 = C106555Zl.A02(latLng, A74);
                    }
                    r22 = groupChatLiveLocationsActivity2.A06;
                    A012 = C106555Zl.A01(latLng);
                }
                r22.A0B(A012, groupChatLiveLocationsActivity2.A05);
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
        if (!(!groupChatLiveLocationsActivity.A0E) && groupChatLiveLocationsActivity.A05 != null) {
            if (groupChatLiveLocationsActivity.A0N.A0o != null && !groupChatLiveLocationsActivity.A0W) {
                groupChatLiveLocationsActivity.A0W = true;
                C54942pX r6 = groupChatLiveLocationsActivity.A0N.A0o;
                C108975ds A002 = C108975ds.A00(r6.A00, r6.A01);
                float A742 = groupChatLiveLocationsActivity.A74(r6.A02, -1.0f);
                if (A742 > groupChatLiveLocationsActivity.A05.A02().A02 || A742 == -1.0f) {
                    r3 = groupChatLiveLocationsActivity.A05;
                    r2 = new AnonymousClass7UM();
                    r2.A06 = A002;
                } else {
                    r3 = groupChatLiveLocationsActivity.A05;
                    r2 = C153847c7.A01(A002, A742);
                }
                r3.A0B(r2, groupChatLiveLocationsActivity.A04, 1500);
            } else if (!groupChatLiveLocationsActivity.A0N.A0u) {
                groupChatLiveLocationsActivity.A79(true);
            }
        }
    }

    public void A0L() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            if (!(!groupChatLiveLocationsActivity2.A0E)) {
                groupChatLiveLocationsActivity2.A76();
                A0K();
                if (!groupChatLiveLocationsActivity2.A0O.A0u) {
                    groupChatLiveLocationsActivity2.A0N.setLocationMode(2);
                    return;
                }
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
        if (!(!groupChatLiveLocationsActivity.A0E)) {
            groupChatLiveLocationsActivity.A76();
            A0K();
            if (!groupChatLiveLocationsActivity.A0N.A0u) {
                groupChatLiveLocationsActivity.A0M.setLocationMode(2);
            }
        }
    }

    public void A0N(float f, boolean z) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            int i2 = (int) f;
            groupChatLiveLocationsActivity2.A01 = i2;
            C105415Uv r0 = groupChatLiveLocationsActivity2.A06;
            if (r0 != null) {
                r0.A08(0, 0, 0, i2);
            }
        } else {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
            int i3 = (int) f;
            groupChatLiveLocationsActivity.A01 = i3;
            C110885hC r02 = groupChatLiveLocationsActivity.A05;
            if (r02 != null) {
                r02.A08(0, 0, i3);
            }
        }
        if (z) {
            A0K();
        }
    }

    public void A0R(C105735We r6) {
        if (this.A01 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            C105345Uo r3 = (C105345Uo) groupChatLiveLocationsActivity2.A0T.get(r6.A03);
            if (r3 != null) {
                if (!r3.A0A()) {
                    r3.A09(true);
                }
                r3.A06(r6.A00());
                Object A012 = r3.A01();
                if (A012 instanceof C105735We) {
                    C105735We r2 = (C105735We) A012;
                    if (r2.A00 != r6.A00 || r2.A01 != r6.A01) {
                        r3.A05(AnonymousClass5CV.A00(groupChatLiveLocationsActivity2.A0O.A06(r6)));
                        r3.A08(groupChatLiveLocationsActivity2.A0O.A0B(r6));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C88534Zc r1 = (C88534Zc) ((GroupChatLiveLocationsActivity) this.A00).A0S.get(r6.A03);
        if (r1 != null) {
            if (!r1.A04) {
                r1.A09(true);
            }
            r1.A0H(C108975ds.A02(r6.A00()));
            A0K();
        }
    }

    public void onLocationChanged(Location location) {
        int i = this.A01;
        super.onLocationChanged(location);
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            if (groupChatLiveLocationsActivity2.A0O.A0s && location != null) {
                C626936e.A06(groupChatLiveLocationsActivity2.A06);
                groupChatLiveLocationsActivity2.A06.A0B(C106555Zl.A01(C86624Kv.A0F(location)), groupChatLiveLocationsActivity2.A05);
            }
            groupChatLiveLocationsActivity2.A0N.A06 = location;
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
        if (groupChatLiveLocationsActivity.A0N.A0s && location != null) {
            C626936e.A06(groupChatLiveLocationsActivity.A05);
            C108975ds A012 = C108975ds.A01(location);
            C110885hC r1 = groupChatLiveLocationsActivity.A05;
            AnonymousClass7UM r0 = new AnonymousClass7UM();
            r0.A06 = A012;
            r1.A09(r0);
        }
    }
}
