package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.7kP  reason: invalid class name and case insensitive filesystem */
public abstract class C158697kP {
    public C105425Uw A00;

    public String A00() {
        if (this instanceof C135706l7) {
            return "undo_delete_shape";
        }
        if (this instanceof C135696l6) {
            return "undo_change_z_order";
        }
        return "undo_add_shape";
    }

    public void A01(List list) {
        int i;
        C105425Uw r0;
        if (this instanceof C135706l7) {
            C135706l7 r02 = (C135706l7) this;
            i = r02.A00;
            r0 = r02.A00;
        } else if (this instanceof C135696l6) {
            C135696l6 r1 = (C135696l6) this;
            list.remove(r1.A00);
            i = r1.A00;
            r0 = r1.A00;
        } else {
            list.remove(this.A00);
            return;
        }
        list.add(i, r0);
    }

    public void A02(JSONObject jSONObject) {
        if (this instanceof C135706l7) {
            ((C135706l7) this).A00 = jSONObject.getInt("index");
        }
    }

    public void A03(JSONObject jSONObject) {
        if (this instanceof C135706l7) {
            jSONObject.put("index", ((C135706l7) this).A00);
        }
    }

    public C158697kP(C105425Uw r1) {
        this.A00 = r1;
    }

    public C158697kP() {
    }
}
