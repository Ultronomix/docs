# Forwards and Redirections

Forwarding and redirecting are both about sending a user to different resources, although they have quite different semantics.

Picking between these is simple. If the previous scope is required, or the user doesn’t need to be informed, but the application also wants to perform an internal action then use forwarding.

To discard the scope or if the new content isn’t associated with the original request – such as a redirect to a login page or completing a form submission – then use redirecting.

---

### Forwarding

- a forward is performed internally by the application (servlet).

- the browser is completely unaware that it has taken place, so its original URL remains intact

- any browser reload of the resulting page will simple repeat the original request, with the original URL

---

### Redirecting

- a redirect is a two step process, where the web application instructs the browser to fetch a second URL, which differs from the original

- a browser reload of the second URL will not repeat the original request, but will rather fetch the second URL

- redirect is marginally slower than a forward, since it requires two browser requests, not one

- objects placed in the original request scope are not available to the second request. 