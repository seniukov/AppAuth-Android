package net.openid.appauth.serial;

import static java.util.Objects.isNull;

import android.net.Uri;

import java.util.Set;

public class Stringifier {
    public static String uriToString(
        final Uri uri,
        final String hash
    ) {
        if (isNull(uri)) {
            return "null";
        }

        Set<String> params = uri.getQueryParameterNames();
        StringBuilder paramsString = new StringBuilder("hash#" + hash + ": [");
        for (String param: params) {
            paramsString.append(param).append(", ");
        }
        paramsString.append("]");

        return paramsString.toString();
    }
}
